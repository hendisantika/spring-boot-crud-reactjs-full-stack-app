const reportWebVitals = onPerfEntry => {
    if (onPerfEntry && onPerfEntry instanceof Function) {
        // web-vitals v4+ renamed getXXX() to onXXX() and replaced FID with INP
        import('web-vitals').then(({onCLS, onINP, onFCP, onLCP, onTTFB}) => {
            onCLS(onPerfEntry);
            onINP(onPerfEntry);
            onFCP(onPerfEntry);
            onLCP(onPerfEntry);
            onTTFB(onPerfEntry);
        });
    }
};

export default reportWebVitals;
